/* (C)2024 */
package com.hansbald.flowgui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

public class FlowFileHelper {

    private static final ObjectMapper yamlMapper = new ObjectMapper(
        new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES));

    private static final CollectionType listType = yamlMapper.getTypeFactory()
        .constructCollectionType(ArrayList.class, Machine.class);

    public static ArrayList<Machine> openProject(String path) {
        try {
            return yamlMapper.readValue(new File(path), listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeProject(String path, ArrayList<Machine> machineList) {
        try {
            File out = new File(path);
            // out.createNewFile();
            yamlMapper.writeValue(out, machineList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
