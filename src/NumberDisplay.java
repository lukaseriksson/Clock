public class NumberDisplay {
protected int limit;
protected int value;

    public NumberDisplay(int maxLimit){
        value = 0;
        limit = maxLimit;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
        if ((newValue < limit) && newValue > 0) {

        }
    }
    public String getDisplayValue(){
        String strvalue = Integer.toString(value);
        return strvalue;
    }

    public int increment(){
        value++;
        if (value >= limit){
            value = 0;
        }
        return value;
    }

}
