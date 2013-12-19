package com.ftzmis.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDocumentProperties;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;

import com.ftzmis.test.CFXDocument;
import com.ftzmis.test.CFXDocument.CFX;
import com.ftzmis.test.CFXDocument.CFX.HEAD;
import com.ftzmis.test.CFXDocument.CFX.MSG;
import com.ftzmis.test.CFXDocument.CFX.MSG.FTZ210101;
import com.ftzmis.test.CFXDocument.CFX.MSG.FTZ210101.BATCH;
import com.ftzmis.test.CFXDocument.CFX.MSG.FTZ210101.TRANLIST;
import com.ftzmis.test.CFXDocument.CFX.MSG.FTZ210101.TRANLIST.TRAN;

public class Test {

	public static void main(String[] args) {
		CFXDocument cfxDocument = null;
		
		try {
			File file = new File("out/test.xml");
			//cfxDocument = CFXDocument.Factory.parse(file);
			cfxDocument = CFXDocument.Factory.parse("<CFX xmlns=\"http://ftzmis.com/test\"/>");
			
			//CFX cfx =  cfxDocument.addNewCFX();
			CFX cfx = cfxDocument.getCFX();			            
			
			HEAD head = cfx.addNewHEAD();			
			head.setVER("1.0");
			head.setSRC("102100009980");
			head.setDES("100000000000ÖÐÎÄ");
			
			MSG msg = cfx.addNewMSG();
			FTZ210101 ftz = msg.addNewFTZ210101();
			
			BATCH batch = ftz.addNewBATCH();
			batch.setAccountNo("4312121212133");
			batch.setAccountName("ÕË»§1");
			batch.setBalance("121212121.12");
			
			TRANLIST tranlist = ftz.addNewTRANLIST();
			TRAN tran = tranlist.addNewTRAN();
			tran.setAmount("200.00");
			tran.setSeqNo("01");
			
			
			XmlCursor cursor = cfxDocument.newCursor();
			cursor.toNextToken();
			cursor.toNextToken();
			//cursor.insertAttributeWithValue(new QName("xmlns"), "");
			//cursor.toFirstAttribute();
			//System.out.println();
			//cursor.toFirstAttribute();
			System.out.println();
			System.out.println(cursor.getName().getLocalPart());

			cursor.dispose();
			
			
			XmlOptions options = new XmlOptions();
			options.setCharacterEncoding("GBK");
			options.setSavePrettyPrint();

			
			cfxDocument.save(file,options);
			/*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "GBK");
			BufferedWriter bf = new BufferedWriter(osw);
			
			bf.write(cfxDocument.toString());
			
			bf.close();*/
			
			
		} catch (XmlException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
