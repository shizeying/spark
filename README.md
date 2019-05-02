# spark

<font size=7 color="red">混合编程</font>

本个项目实战:

&emsp;&emsp;数据库管理:default&emsp;spark-db1&emsp;spark-db2

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;id:数据库编号

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name:数据库名称

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;location:数据库存放在HDFS等文件系统上的目录

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;/user/hive/warehouse

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;/user/hive/warehouse/spark-db1.db

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;java语言实现

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;表管理:&emsp;&emsp;&emsp;spark-table1&emsp;&emsp;spark-table2&emsp;&emsp;&emsp;表是要属于某一个数据库

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;id:表名称

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;name:表名称

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;tableType:表类型&emsp;&emsp;&emsp;内部表/外部表

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;dbId:该表所属的数据库id

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;默认存储路径:db对应的location/tableName

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;scala语言实现

## 开发环境搭建

- IDEA+Spring boot+Data+java
- IDEA+Spring boot+Date+Scala

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;