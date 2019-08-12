package com.yurwar.trainingcourse.util.validator;

public class SizeValidator implements Validator<String> {
    private int minSize;
    private int maxSize;
    private String message = "Size must be from " + minSize + " to " + maxSize + " length";

    public SizeValidator(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public SizeValidator(int minSize, int maxSize, String message) {
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.message = message;
    }

    @Override
    public Result validate(String value) {
        if (value.length() >= minSize && value.length() <= maxSize) {
            return new SimpleResult(true);
        } else {
            return new SimpleResult(false, message);
        }
    }
}
