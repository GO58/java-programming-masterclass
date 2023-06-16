
public class Refrigerator{
   private boolean hasWorkToDo;

   public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
}

public boolean isHasWorkToDo() {
    return hasWorkToDo;
}

public Refrigerator(){
    hasWorkToDo = false;
   }
    
   public void orderFood(){
    if(hasWorkToDo){
        System.out.println("Ordering food");
    }
   }
}
