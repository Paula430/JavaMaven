package com.solvd.entities;

import java.util.Objects;

public abstract class Breed {
    protected String name;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Breed other = (Breed) obj;
        return Objects.equals(name, other.name);
    }


}

