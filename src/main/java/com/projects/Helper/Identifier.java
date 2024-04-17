package com.projects.Helper;

import java.util.UUID;

public class Identifier {

    private UUID id;

    public Identifier(){
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return this.id;
    }
}

