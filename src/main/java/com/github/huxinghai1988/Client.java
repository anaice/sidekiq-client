package com.github.huxinghai1988;

/**
 * Created by huxinghai on 15/4/25.
 */
public interface Client {

    String enqueue(Worker worker);

    Worker find(String jid);

    long delete(String jid);
}
