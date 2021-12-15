package ru.bmstu.lab4;

import akka.actor.ActorSystem;

public class Server {
    private static final String ACTOR_SYSTEM_NAME = "system";

    public static void start(){
        ActorSystem actorSystem = ActorSystem.create(ACTOR_SYSTEM_NAME);

    }
}
