package com.cqfc.db.tool.tables;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GenSubTables {

	public static void main(String[] args) throws IOException {
//		genSubTable("./sql/t_lottery_deal_byplan_.sql");
//		genSubTable("./sql/t_lottery_plan_.sql");
//		genSubTable("./sql/t_lottery_deal_.sql");
//		genSubTable("./sql/t_lottery_append_detail_.sql");
//		genSubTable("./sql/t_lottery_ticket_.sql");

		
//		genSubTableday("./sql_finance/t_lottery_station_bind_record_00.sql");
		genSubTable("./sql_finance/t_lottery_station_bind_record_00.sql");
//		genSubTable("./sql_finance/t_lottery_finance_0000.sql");
//		genSubTable("./sql_finance/t_lottery_finance_detail_0000.sql");
//		genSubTable("./sql_finance/t_lottery_pay_account_0000.sql");
//		genSubTable("./sql_finance/t_lottery_payinfo_0000.sql");
//		genSubTable("./sql_finance/t_lottery_unfreeze_0000.sql");
//		genSubTable("./sql_finance/t_lottery_userinfo_0000.sql");
//		genSubTable("./sql_finance/t_lottery_userinfo_byacc_0000.sql");
//		genSubTable("./sql_finance/t_lottery_wx_user_token_0000.sql");
//		genSubTable("./sql_finance/t_lottery_wx_user_token_bywx_0000.sql");
	}
	
	
	static void genSubTableday(String file) throws FileNotFoundException,
			IOException {
		StringBuilder builder = new StringBuilder();
		
		FileInputStream stream = new FileInputStream(file);
		InputStreamReader re = new InputStreamReader(stream);
		BufferedReader reader = new BufferedReader(re);
		String line;
		while((line=reader.readLine())!=null){
			builder.append(line).append("\n");
		}
		reader.close();
		re.close();
		stream.close();
		
		
		FileOutputStream outputStream = new FileOutputStream(file+"_sub.sql");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter writer = new BufferedWriter(outputStreamWriter);
		int tableSize=12;
		for (int i = 1; i <= tableSize; i++) {
			String yuefen = formatSuffix(i, tableSize);
			for (int j = 1; j <= 31; j++) {
				String rifen = formatSuffix(j, 31);
				String all = builder.toString().replaceAll("#YUEFEN#", yuefen);
				all = all.replace("#RIFEN#", rifen);
				writer.write(all);
				writer.write('\n');
			}
		}
		writer.close();
		outputStreamWriter.close();
		outputStream.close();
		
		System.out.println(file+"分表成功生成！");
	}
	
	

	static void genSubTable(String file) throws FileNotFoundException,
			IOException {
		StringBuilder builder = new StringBuilder();
		
		FileInputStream stream = new FileInputStream(file);
		InputStreamReader re = new InputStreamReader(stream);
		BufferedReader reader = new BufferedReader(re);
		String line;
		while((line=reader.readLine())!=null){
			builder.append(line).append("\n");
		}
		reader.close();
		re.close();
		stream.close();
		
		
		FileOutputStream outputStream = new FileOutputStream(file+"_sub.sql");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter writer = new BufferedWriter(outputStreamWriter);
		int tableSize=12;
		for (int i = 0; i < tableSize; i++) {
			String suffix = formatSuffix(i, tableSize);
			String all = builder.toString().replaceAll("####", suffix);
			writer.write(all);
			writer.write('\n');
		}
		writer.close();
		outputStreamWriter.close();
		outputStream.close();
		
		System.out.println(file+"分表成功生成！");
	}
	
	//格式补齐位数，不足的前面补零
	private static String formatSuffix(int tableIndex, int tableSize){
		int tableIndexLen = String.valueOf(tableIndex).length();
		int tableSizeLen = String.valueOf(tableSize).length();
		StringBuffer zeroBuf = new StringBuffer();
		for(int i=tableIndexLen; i<tableSizeLen; i++){
			zeroBuf.append("0");
		}
		return zeroBuf.toString()+tableIndex;
	}
	
}
