package io.github.natanimn.types.input;


import java.io.File;
import java.io.Serializable;
import java.util.List;

public interface InputMedia extends Serializable {
    boolean hasFile();
    List<File> getFiles();
}
