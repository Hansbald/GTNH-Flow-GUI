/* (C)2024 */
package com.hansbald.flowgui;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

@JsonPropertyOrder({ "m", "tier", "eut", "dur", "I", "O", "heat", "coils", "group", "number", "target" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Machine {

    private String name;
    private String tier;
    private String eut;
    private String dur;
    private HashMap<String, String> inputs;
    private HashMap<String, String> outputs;
    private String heat;
    private String coils;
    private String group;
    private String number;
    private HashMap<String, String> targets;

    // region <Getters & Setters>
    @JsonProperty("m")
    public String getMachineName() {
        return name;
    }

    @JsonProperty("m")
    public void setMachineName(String name) {
        this.name = name;
    }

    @JsonProperty("tier")
    public String getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(String tier) {
        this.tier = tier;
    }

    @JsonProperty("eut")
    public String getEuTick() {
        return eut;
    }

    @JsonProperty("eut")
    public void setEuTick(String eut) {
        this.eut = eut;
    }

    @JsonProperty("dur")
    public String getDuration() {
        return dur;
    }

    @JsonProperty("dur")
    public void setDuration(String dur) {
        this.dur = dur;
    }

    @JsonProperty("I")
    public HashMap<String, String> getInputs() {
        return inputs;
    }

    @JsonProperty("I")
    public void setInputs(HashMap<String, String> inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("O")
    public HashMap<String, String> getOutputs() {
        return outputs;
    }

    @JsonProperty("O")
    public void setOutputs(HashMap<String, String> outputs) {
        this.outputs = outputs;
    }

    @JsonProperty("heat")
    public String getHeat() {
        return heat;
    }

    @JsonProperty("heat")
    public void setHeat(String heat) {
        this.heat = heat;
    }

    @JsonProperty("coils")
    public String getCoils() {
        return coils;
    }

    @JsonProperty("coils")
    public void setCoils(String coils) {
        this.coils = coils;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("target")
    public HashMap<String, String> getTargets() {
        return targets;
    }

    @JsonProperty("target")
    public void setTargets(HashMap<String, String> targets) {
        this.targets = targets;
    }

    // endregion
}
