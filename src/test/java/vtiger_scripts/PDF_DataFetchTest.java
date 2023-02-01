package vtiger_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.common.function.type4.Parser;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.PDF;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class PDF_DataFetchTest {
@Test
public void pdf() throws IOException, SAXException, TikaException {
	BodyContentHandler bch=new BodyContentHandler();
	FileInputStream fis=new FileInputStream("./Test_Data/resumenew1.pdf");
	Metadata md=new Metadata();
	ParseContext pc=new ParseContext();
	org.apache.tika.parser.pdf.PDFParser pdfParser = new org.apache.tika.parser.pdf.PDFParser();
	pdfParser.parse(fis, bch, md, pc);
	System.out.println(bch.toString());
}
}
