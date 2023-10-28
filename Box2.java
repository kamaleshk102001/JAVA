public class Box2 {
    int length;
    int breadth;
    int height;

    Box2(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }

    Boolean isEqual(Box2 b2){
        if(length==b2.length&&breadth==b2.breadth&&height==b2.height){
            return true;
        }
        return false;
    }

    Box2 doubleBox(){
        Box2 temp=new Box2(2*length,2*breadth,2*height);
        return temp;
    }

}
