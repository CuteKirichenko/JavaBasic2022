package testing;

import org.junit.*;

public class CalculatorImplTest {

    Calculator calculator = new CalculatorImpl();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only once");
    }

    @Before
    public void setUp() {
        System.out.println("Code executes before each test method");
    }

    @Test
    public void addPositive() {
        int a = 4;
        int b = 6;
        int expectedSum = 10;
        int actualSum = calculator.add(a, b);

        Assert.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void addNegative() {
        int a = -4;
        int b = -6;
        int expectedSum = -10;
        int actualSum = calculator.add(a, b);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void addPositiveAndNegative() {
        int a = -4;
        int b = 6;
        int expectedSum = 2;
        int actualSum = calculator.add(a, b);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void subtract() {

    }

    @Test
    public void multiply() {
    }

    @Test
    public void division() {
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Tests finished");
    }

    @After
    public void afterMethod() {
        System.out.println("Code executes after each test method");
    }
}