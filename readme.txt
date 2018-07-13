使用方法:
1:直接导入到eclipse中,运行ModelGenerator.java
2:使用命令行(需先打开配置文件中的classPathEntry,并注意文件路径)
java -jar mybatis-generator-core-1.3.2.jar -configfile ../src/com/tool/generatorConfig.xml -overwrite

ps: 1.生成器无法自动创建目录
	2.官方文档:http://mybatis.github.io/generator/