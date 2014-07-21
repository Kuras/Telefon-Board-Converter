package main;


public class Main {

	public static void main(String[] args) {
		BoardConverter bc = new BoardConverter();
		bc.showConvertEntities();
		bc.getReaderRecord().closeStream();
	}

}
