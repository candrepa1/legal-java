package application;

public class Cell {
	public String value;
    public int row;
    public int col;
    public boolean wasGuessed;
    public String filename;

    Cell(String value, String filename, int row,int col){
        this.value = value;
        this.row = row;
        this.col = col;
        this.wasGuessed = false;
        this.filename = filename;
    }
}
