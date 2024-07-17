package MyTestClasses;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

public final class ImmutableTesting {

    private final String name;
    private final int rollNO;
    private final List<String> Emp;

    public ImmutableTesting(String name, int rollNO, List<String> emp, List<String> emp1) {
        this.name = name;
        this.rollNO = rollNO;
        Emp = emp1;
        List<String> Emp1 = new LinkedList<>();
        Emp1 = emp;
    }

    public ImmutableTesting(String name, int rollNO, List<String> emp) {
        this.name = name;
        this.rollNO = rollNO;
        Emp = emp;
    }

    public String getName() {
        return name;
    }

    public int getRollNO() {
        return rollNO;
    }

    public List<String> getEmp() {
        return Emp;
    }
}
