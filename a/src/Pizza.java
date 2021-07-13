
public class Pizza {
	String kind;
    int size;

    public Pizza(){}
    public Pizza(String kind){
        this.kind = kind;
    }
    public Pizza(String kind, int size){
        this.size = size;
        this.kind = kind;
    }


    void toPrint(){
        System.out.println("종류:"+ this.kind+" 크기:"+this.size);
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}