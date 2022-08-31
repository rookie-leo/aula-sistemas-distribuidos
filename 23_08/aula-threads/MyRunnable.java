// Programa para mostrar o uso de threads
public class MyRunnable {

    public static void main(String[] args) {
        //criação dos objetos runnable
        ClasseRunnable r1 = new ClasseRunnable(5);


        //criação e execução dos Threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new ClasseRunnable(5));
        Thread t3 = new Thread(new ClasseRunnable(5));

        t1.setName("Runnable 1 ");
        
        //MIN(1), NORMAL(5) e MAX(10)
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        
        t2.setName("Runnable 2 ");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        
        t3.setName("Runnable 2 ");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
    }

}

class ClasseRunnable implements java.lang.Runnable {

    private int contador;
    private final int contadorTodtal;

    public ClasseRunnable(int contadorTotal) {
        this.contadorTodtal = contadorTotal;
        this.contador = 0;
    }

    @Override
    public void run() {
        while (contador <= contadorTodtal) {
            System.out.println(Thread.currentThread()
                .getName() + "Prioridade: " + Thread.currentThread().getPriority());

            System.out.println(Thread.currentThread()
                .getName() + "Contador: " + contador);

                contador++;

            try {
                System.out.println(Thread.currentThread().getName() + " ... está dormindo");
                Thread.sleep(2000);                    
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        System.out.println("Thread finalizada!");
    }
}