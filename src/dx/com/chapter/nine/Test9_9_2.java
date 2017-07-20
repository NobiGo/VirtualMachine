package dx.com.chapter.nine;

/**
 * Created by dx on 2017/7/19.
 */
public class Test9_9_2 {
    public static final int TYPE = 1;
    
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id)throws IllegalStateException {
        try {
            this.id = id;
        }catch (IllegalStateException e){
            System.out.println(e.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

