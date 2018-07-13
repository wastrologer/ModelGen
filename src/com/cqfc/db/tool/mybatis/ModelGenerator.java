package com.cqfc.db.tool.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ModelGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ModelGenerator helper=new ModelGenerator();
			
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			InputStream fileInputStream=helper.openFile("com/cqfc/db/tool/mybatis/generatorConfig.xml");
			
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(fileInputStream);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
			
			for (String warning:warnings){
				System.out.println("warning: "+warning);
			}
			
			System.out.println(fileInputStream+" finish");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
    public InputStream openFile(String fileName) {
    	return this.getClass().getClassLoader().getResourceAsStream(fileName);
    }

}
