package br.com.alura.servidor;

public class TratadorDeExcecao implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread thread, Throwable ex) {

        System.out.println("Exceção na thread " + thread.getName() + ": " + ex.getMessage());
    }
}
