package def.dom;

import def.js.Object;

public class AudioParam extends def.js.Object {
    public double defaultValue;
    public double value;
    native public void cancelScheduledValues(double startTime);
    native public void exponentialRampToValueAtTime(double value, double endTime);
    native public void linearRampToValueAtTime(double value, double endTime);
    native public void setTargetAtTime(double target, double startTime, double timeConstant);
    native public void setValueAtTime(double value, double startTime);
    native public void setValueCurveAtTime(java.lang.Object values, double startTime, double duration);
    public static AudioParam prototype;
    public AudioParam(){}
}

