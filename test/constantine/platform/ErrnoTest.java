/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package constantine.platform;

import constantine.Constant;
import constantine.ConstantSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wayne
 */
public class ErrnoTest {
    private ConstantSet constants;
    public ErrnoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        constants = ConstantSet.getConstantSet("Errno");
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test public void intValue() {
        for (Errno errno : Errno.values()) {
            if (errno == Errno.__UNKNOWN_CONSTANT__) {
                continue;
            }
            int val = constants.getValue(errno.name());
            assertEquals("Incorrect integer value for " + errno.name(), val, errno.value());
        }
    }
    @Test public void valueOf() {
        for (Errno errno : Errno.values()) {
            if (errno == Errno.__UNKNOWN_CONSTANT__) {
                continue;
            }
            Errno e = Errno.valueOf(errno.value());
            assertEquals("Incorrect integer value for " + errno.name(), errno.value(), e.value());
        }
    }
    @Test public void unknownConstant() {
        Errno none = Errno.valueOf(~0);
        assertEquals("Incorrect errno for unknown value", Errno.__UNKNOWN_CONSTANT__, none);
    }
}