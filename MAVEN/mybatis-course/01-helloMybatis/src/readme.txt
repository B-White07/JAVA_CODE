01-helloMybatis:第一个入门的myBatis例子

实现步骤：
1.新建Student表
2.在maven中加入mybatis坐标和mysql驱动坐标
3.创建实体类Student，保存表中的一行数据
4.创建持久层的dao接口，定义操作数据库的方法
5.创建一个mybatis使用的配置文件
    叫做sql映射文件：写sql语句，一般一个表一个sql映射文件
    这个文件是xml文件
6.创建mybatis的主配置文件：
    一个项目只有一个主配置文件
    主配置文件提供了mysql数据库的连接信息和sql映射文件的位置信息
7.创建使用mybatis类
    通过mybatis访问数据库
