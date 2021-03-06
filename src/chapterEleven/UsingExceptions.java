package chapterEleven;

public class UsingExceptions {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e){
            System.err.printf("%s%n%n", e.getMessage());
            e.printStackTrace();
            StackTraceElement[] traceElements = e.getStackTrace();


            System.out.printf("%n Stack trace from getStackTrace: %n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element: e.getStackTrace()){
                System.out.printf("%s\t",element.getClassName());
                System.out.printf("%s\t",element.getFileName());
                System.out.printf("%s\t",element.getLineNumber());
                System.out.printf("%s\t",element.getMethodName());
            }
        }
    }
    public static void method1() throws Exception{
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
