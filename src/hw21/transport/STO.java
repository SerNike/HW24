package hw21.transport;

import hw21.transport.Bus.Bus;
import hw21.transport.Exeption.DiagnosticsFaliedException;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в СТО");
        } else {
            transportQueue.add(transport);
        }
    }

    public void runTO() {
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {
            try {
                transport.passDiagnostics();
                transport.getMechanic().iterator().next().maintenance();
            } catch (DiagnosticsFaliedException e) {
                System.out.println("Ошибка проведения СТО" + transport);
            }
        }
    }
}
