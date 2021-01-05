####SpringBoot整合MybatisPlus配置Druid数据源

> 留作记录，方便以后查看、使用

SQL
```sql
CREATE TABLE `tb_user` (
  `id` varchar(255) NOT NULL,
  `username` varchar(64) NOT NULL,
  `password` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```