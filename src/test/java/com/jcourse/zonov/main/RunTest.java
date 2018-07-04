package com.jcourse.zonov.main;

import com.jcourse.zonov.data.Parser;
import com.jcourse.zonov.exception.CalcException;
import com.jcourse.zonov.math.Command;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RunTest extends Command {

    @Test
    public void main() throws FileNotFoundException {

        Class<?> aClass = getClass();
        InputStream is = aClass.getClassLoader().getResourceAsStream("data");

        List<Command> commands = Parser.pars(is);
        commands.forEach(c-> {
            try {
                c.execute();
            } catch (CalcException e) {
                e.printStackTrace();
            }
        });
        assertEquals(5.0, stack.peek(), 0.1);
    }


    @Override
    public void execute() throws CalcException {

    }
}