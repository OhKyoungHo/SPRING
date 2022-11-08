package ex3_autowiring;

import java.io.FileWriter;
import java.io.IOException;

public class OutPuterImpl implements OutPuter {
	
	private String path;
	
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void writeMessage(String msg) throws IOException {
		FileWriter fw = new FileWriter(path);
		fw.write(msg);
		fw.close();

	}

}
