import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        myFrame myFrame1=new myFrame(100,100,200,200,Color.blue);
        myFrame myFrame2=new myFrame(300,100,200,200,Color.yellow);
        myFrame MyFrame3=new myFrame(100,300,200,200,Color.red);
        myFrame myFrame4=new myFrame(300,300,200,200,Color.black);
    }
}
class myFrame extends Frame{
    static int i=0;
    public myFrame(int x,int y,int w,int h,Color color){
        super("myFrame"+(++i));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
