package parttime;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NotepadMainFrame extends JFrame implements ActionListener{
    private static final long serialVersionUID = 8585210209467333480L;	//序列号
    public Clipboard clipboard = new Clipboard("系统剪切板");	//剪贴板
    private JPanel contentPane;	//容器
    private JTextArea textArea;	//文本框
    private JMenu itemEdit,itemHelp;	//菜单
    private JScrollPane scrollPane; //滚动条
    private JMenuItem itemOpen,itemSave,itemSaveAs,itemNew,itemAboutNotepad,itemCut,itemCopy,itemPaste,itemFind,itemReplace,itemSelectAll,itemExit;	//菜单条
    String currentFileName=null;	//当前文件名

    public static void main(String[] args) {	//启动应用程序
        EventQueue.invokeLater(new Runnable() {	//不允许同时从该队列中指派多个事件
            public void run() {
                try {
                    NotepadMainFrame frame = new NotepadMainFrame();
                    frame.setVisible(true);	//显示窗口
                    frame.setIconImage(new ImageIcon(SystemParam.class.getResource("k.png")).getImage());
                }catch (Exception e) {e.printStackTrace();}
            }
        });
    }

    public NotepadMainFrame() {	//创建frame
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());} 	//设置图形界面外观
        catch (ClassNotFoundException e1) {e1.printStackTrace();}
        catch (InstantiationException e1) {e1.printStackTrace();}
        catch (IllegalAccessException e1) {e1.printStackTrace();}
        catch (UnsupportedLookAndFeelException e1) {e1.printStackTrace();}
        setTitle("记事本");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	//设置用户在此窗体上发起 "close" 时,不执行任何操作
        setBounds(400, 180, 600, 400);	//设置窗口位置和大小

        JMenuBar menuBar = new JMenuBar();	//菜单栏
        setJMenuBar(menuBar);

        JMenu itemFile = new JMenu("文件(F)");
        itemFile.setMnemonic('F');	//设置快捷键"Alt+F"
        menuBar.add(itemFile);	//将"文件"菜单添加到菜单栏上

        itemNew = new JMenuItem("新建(N)");	//创建"新建"菜单条
        itemNew.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N,java.awt.Event.CTRL_MASK));	//设置"新建"快捷键 Ctrl+N
        itemNew.addActionListener(this);	//注册监听者
        itemFile.add(itemNew);	//将"新建"菜单条添加到"文件"菜单

        itemOpen = new JMenuItem("打开(O)");
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O,java.awt.Event.CTRL_MASK));
        itemOpen.addActionListener(this);
        itemFile.add(itemOpen);

        itemSave = new JMenuItem("保存(S)");
        itemSave.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S,java.awt.Event.CTRL_MASK));
        itemSave.addActionListener(this);
        itemFile.add(itemSave);

        itemSaveAs = new JMenuItem("另存为(A)");
        itemSaveAs.addActionListener(this);
        itemFile.add(itemSaveAs);
        itemFile.addSeparator();	//分割线

        itemExit = new JMenuItem("退出(X)");
        itemExit.addActionListener(this);
        itemFile.add(itemExit);

        itemEdit = new JMenu("编辑(E)");
        itemEdit.setMnemonic('E');
        menuBar.add(itemEdit);	//将"编辑"菜单添加到菜单栏上

        itemCut = new JMenuItem("剪切(T)");
        itemCut.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X,java.awt.Event.CTRL_MASK));
        itemCut.addActionListener(this);
        itemEdit.add(itemCut);

        itemCopy = new JMenuItem("复制(C)");
        itemCopy.addActionListener(this);
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C,java.awt.Event.CTRL_MASK));
        itemEdit.add(itemCopy);

        itemPaste = new JMenuItem("粘贴(P)");
        itemPaste.addActionListener(this);
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V,java.awt.Event.CTRL_MASK));
        itemEdit.add(itemPaste);
        itemEdit.addSeparator();

        itemFind = new JMenuItem("查找(F)");
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK));
        itemFind.addActionListener(this);
        itemEdit.add(itemFind);

        itemReplace = new JMenuItem("替换(R)");
        itemReplace.addActionListener(this);
        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.CTRL_MASK));
        itemEdit.add(itemReplace);
        itemEdit.addSeparator();

        itemSelectAll = new JMenuItem("全选(A)");
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,java.awt.Event.CTRL_MASK));
        itemSelectAll.addActionListener(this);
        itemEdit.add(itemSelectAll);

        itemHelp = new JMenu("帮助(H)");
        itemHelp.setMnemonic('H');
        menuBar.add(itemHelp);	//将"帮助"菜单添加到菜单栏上

        itemAboutNotepad = new JMenuItem("关于记事本(A)");
        itemAboutNotepad.addActionListener(this);
        itemHelp.add(itemAboutNotepad);

        textArea = new JTextArea();
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));	//边界布局
        setContentPane(contentPane); 	//把contentPane对象设置成为内容面板
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	//设置水平和垂直滚动条
        contentPane.add(scrollPane, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter(){	//添加关闭窗口监听
            public void windowClosing(WindowEvent e) {	//这是窗口关闭事件
                int result=JOptionPane.showConfirmDialog(NotepadMainFrame.this, "确定关闭？", "系统提示", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if(result==JOptionPane.OK_OPTION){
                    NotepadMainFrame.this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {	//行为动作
        if(e.getSource()==itemOpen){openFile();}	//打开
        else if(e.getSource()==itemSave){save();}	//保存
        else if(e.getSource()==itemSaveAs){save();}	//另保存
        else if(e.getSource()==itemNew){textArea.setText("");}	//新建
        else if(e.getSource()==itemExit){dispose();System.exit(0);}	//退出
        else if(e.getSource()==itemCut){textArea.cut();}	//剪切
        else if(e.getSource()==itemCopy){textArea.copy();}	//复制
        else if(e.getSource()==itemPaste){textArea.paste();}	//粘贴
        else if(e.getSource()==itemFind){mySearch();}	//查找
        else if(e.getSource()==itemReplace){mySearch();}	//替换
        else if(e.getSource()==itemSelectAll){textArea.selectAll();}	//全选
        else if(e.getSource()==itemAboutNotepad){JOptionPane.showMessageDialog(this, "这是一个记事本      制作人：191206225高紫月");}	//设置消息提示框
    }

    private void save() {	//保存
        JFileChooser choose=new JFileChooser();	//打开文件选择框
        int result=choose.showSaveDialog(this);	//选择文件夹
        if(result==JFileChooser.APPROVE_OPTION){
            File file=choose.getSelectedFile();	//取得选择的文件夹
            FileWriter fw=null;
            try {	//保存
                fw=new FileWriter(file);
                fw.write(textArea.getText());
                currentFileName=file.getName();	//将保存文件名存起来
                fw.flush();	//把缓冲区的数据强行输出
                this.setTitle(currentFileName);
            }
            catch(Exception e){e.printStackTrace();}
        }
    }

    private void openFile() {	//打开文件
        JFileChooser choose=new JFileChooser();	//打开文件选择框
        int result=choose.showOpenDialog(this);	//选择文件
        if(result==JFileChooser.APPROVE_OPTION){
            File file=choose.getSelectedFile();	//取得选择的文件
            currentFileName=file.getName();	//打开已存在的文件，提前将文件名存起来
            if( currentFileName.endsWith(".java")){	//只打开java后缀文件
                this.setTitle(this.currentFileName);
                BufferedReader br=null;
                try {
                    InputStreamReader isr=new InputStreamReader(new FileInputStream(file),"GBK");	//建立文件流[字符流]
                    br=new BufferedReader(isr);	//动态绑定
                    StringBuffer sb=new StringBuffer();	//读取内容
                    String line=null;
                    while((line=br.readLine())!=null){	//一次读一行，读入null时文件结束
                        sb.append(line+SystemParam.LINE_SEPARATOR);
                    }
                    textArea.setText(sb.toString());	//显示在文本框[多框]
                }
                catch(Exception e){e.printStackTrace();}
            }
            else{
                JOptionPane.showMessageDialog(this, "打开的文件类型不匹配");
            }
        }
    }

    public void mySearch() {
        final JDialog findDialog = new JDialog(this, "查找与替换", true);
        Container con = findDialog.getContentPane();
        con.setLayout(new FlowLayout(FlowLayout.LEFT));	//流动布局
        JLabel searchContentLabel = new JLabel("查找内容(N) :");
        JLabel replaceContentLabel = new JLabel("替换为(P)　 :");
        final JTextField findText = new JTextField(20);
        final JTextField replaceText = new JTextField(20);
        final JCheckBox matchcase = new JCheckBox("区分大小写");
        ButtonGroup bGroup = new ButtonGroup();	//定义一个组别
        final JRadioButton up = new JRadioButton("向上(U)");
        final JRadioButton down = new JRadioButton("向下(D)");
        down.setSelected(true);
        bGroup.add(up);
        bGroup.add(down);
        JButton searchNext = new JButton("查找下一个(F)");
        JButton replace = new JButton("替换(R)");
        final JButton replaceAll = new JButton("全部替换(A)");
        searchNext.setPreferredSize(new Dimension(120, 20));	//按钮窗口大小
        replace.setPreferredSize(new Dimension(120,20));
        replaceAll.setPreferredSize(new Dimension(120,20));

        replace.addActionListener(new ActionListener() {	// "替换"按钮的事件处理
            public void actionPerformed(ActionEvent e) {
                if (replaceText.getText().length() == 0 && textArea.getSelectedText() != null)	//替换文本内容长度为空和文本不为空
                    textArea.replaceSelection("");
                if (replaceText.getText().length() > 0 && textArea.getSelectedText() != null)
                    textArea.replaceSelection(replaceText.getText());
            }
        });

        replaceAll.addActionListener(new ActionListener() {	// "替换全部"按钮的事件处理
            public void actionPerformed(ActionEvent e) {
                textArea.setCaretPosition(0); 	// 将光标放到编辑区开头
                int a = 0, b = 0, replaceCount = 0;
                if (findText.getText().length() == 0) {
                    JOptionPane.showMessageDialog(findDialog, "请填写替换内容!", "提示", JOptionPane.WARNING_MESSAGE);
                    findText.requestFocus(true);	//输入焦点放在查找框
                    return;
                }
                while (a > -1) {
                    int FindStartPos = textArea.getCaretPosition();	//光标位置
                    String str1, str2, str3, str4, strA, strB;
                    str1 = textArea.getText();
                    str2 = str1.toLowerCase();	//将str1的英文字符转换为大写字母
                    str3 = findText.getText();
                    str4 = str3.toLowerCase();	//将str3的英文字符转换为大写字母
                    if (matchcase.isSelected()) {	// "区分大小写"的CheckBox
                        strA = str1;
                        strB = str3;
                    } else {
                        strA = str2;
                        strB = str4;
                    }
                    if (up.isSelected()) {
                        if (textArea.getSelectedText() == null) {	//获取文本为空
                            a = strA.lastIndexOf(strB, FindStartPos - 1);	//符串出现的位置
                        } else {
                            a = strA.lastIndexOf(strB, FindStartPos - findText.getText().length() - 1);
                        }
                    } else if (down.isSelected()) {
                        if (textArea.getSelectedText() == null) {
                            a = strA.indexOf(strB, FindStartPos);
                        } else {
                            a = strA.indexOf(strB, FindStartPos - findText.getText().length() + 1);
                        }
                    }
                    if (a > -1) {
                        if (up.isSelected()) {
                            textArea.setCaretPosition(a);
                            b = findText.getText().length();
                            textArea.select(a, a + b);
                        } else if (down.isSelected()) {
                            textArea.setCaretPosition(a);
                            b = findText.getText().length();
                            textArea.select(a, a + b);
                        }
                    } else {
                        if (replaceCount == 0) {
                            JOptionPane.showMessageDialog(findDialog, "找不到您查找的内容!", "记事本", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(findDialog, "成功替换" + replaceCount + "个匹配内容!", "替换成功", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    if (replaceText.getText().length() == 0 && textArea.getSelectedText() != null) {
                        textArea.replaceSelection("");
                        replaceCount++;
                    }
                    if (replaceText.getText().length() > 0 && textArea.getSelectedText() != null) {
                        textArea.replaceSelection(replaceText.getText());
                        replaceCount++;
                    }
                }
            }
        });

        searchNext.addActionListener(new ActionListener() {	// "查找下一个"按钮事件处理
            public void actionPerformed(ActionEvent e) {
                int a = 0, b = 0;
                int FindStartPos = textArea.getCaretPosition();	//插入符的位置
                String str1, str2, str3, str4, strA, strB;
                str1 = textArea.getText();
                str2 = str1.toLowerCase();	//将str1的英文字符转换为大写字母
                str3 = findText.getText();
                str4 = str3.toLowerCase();	//将str3的英文字符转换为大写字母
                if (matchcase.isSelected()) {	// "区分大小写"的CheckBox
                    strA = str1;
                    strB = str3;
                } else {
                    strA = str2;
                    strB = str4;
                }
                if (up.isSelected()) {
                    if (textArea.getSelectedText() == null) {
                        a = strA.lastIndexOf(strB, FindStartPos - 1);
                    } else {
                        a = strA.lastIndexOf(strB, FindStartPos - findText.getText().length() - 1);
                    }
                } else if (down.isSelected()) {
                    if (textArea.getSelectedText() == null) {
                        a = strA.indexOf(strB, FindStartPos);
                    } else {
                        a = strA.indexOf(strB, FindStartPos - findText.getText().length() + 1);
                    }
                }
                if (a > -1) {
                    if (up.isSelected()) {
                        textArea.setCaretPosition(a);
                        b = findText.getText().length();
                        textArea.select(a, a + b);
                    } else if (down.isSelected()) {
                        textArea.setCaretPosition(a);
                        b = findText.getText().length();
                        textArea.select(a, a + b);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "找不到您查找的内容!", "记事本", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JButton cancel = new JButton("取消");	// "取消"按钮及事件处理
        cancel.setPreferredSize(new Dimension(80, 22));
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findDialog.dispose();	//释放屏幕资源
            }
        });
        // 创建"查找与替换"对话框的界面
        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel replacePanel = new JPanel();
        JPanel direction = new JPanel();

        direction.setBorder(BorderFactory.createTitledBorder("方向 "));
        direction.add(up);
        direction.add(down);
        direction.setPreferredSize(new Dimension(180, 60));

        replacePanel.setLayout(new GridLayout(2, 1));	//网格布局2行1列
        replacePanel.add(replace);
        replacePanel.add(replaceAll);
        //第一行
        topPanel.add(searchContentLabel);
        topPanel.add(findText);
        topPanel.add(searchNext);
        //第二行
        centerPanel.add(replaceContentLabel);
        centerPanel.add(replaceText);
        centerPanel.add(replacePanel);

        bottomPanel.add(matchcase);
        bottomPanel.add(direction);
        bottomPanel.add(cancel);

        con.add(topPanel);
        con.add(centerPanel);
        con.add(bottomPanel);

        findDialog.setSize(380, 200);	// 设置"查找与替换"对话框的大小
        findDialog.setResizable(false);	//可更改大小(否)
        findDialog.setLocation(400, 200);	//位置
        findDialog.setVisible(true);	//可见性
    }
}