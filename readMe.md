# java 基于SSM博客系统

## 技术选型
### 数据库：mysql
### 后端框架使用 spring+springMVC+mybatis
### 图片存储服务器：fastDFS
### 前段：jsp

## 学习前置知识要求：了解ssm框架，会用ssm实现简单的增删改查

## 特别提醒：本系统采用了fastDFS图片服务器上传图片，需要在虚拟机 搭建fastDFS系统，且导入工程后需要手动下载fastdfs_client包。尤其是搭建fastDFS是一个比较复杂的过程，建议初学的同学直接把
fastDFS和图片上传相关功能先屏蔽。
```aidl
<!-- 由于中央仓库没有提供该包，需要手动安装 -->
        <dependency>
			  <groupId>fastdfs_client</groupId>
			  <artifactId>fastdfs_client</artifactId>
			  <version>1.25</version>
    	</dependency>
```

## 系统功能说明
### 文章表： 添加文章、通过id查询文章、通过分类查询文章、修改……
### 分类表：查询分类列表
### 评论表：给谋篇篇文章添加评论、通过文章id查询评论列表、管理员删除评论

### 用户表：属于针对管理的用户，不开放注册功能。用户可以添加文章，修改文章，删除评论等功能。
## 以上数据表 及 对应的功能 组成了个人博客最核心的 数据和功能！


