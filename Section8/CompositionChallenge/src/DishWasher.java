
public class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public DishWasher(){
        hasWorkToDo = false;
    }
   
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing the dishes");
            hasWorkToDo = false;
        }
    }
}
