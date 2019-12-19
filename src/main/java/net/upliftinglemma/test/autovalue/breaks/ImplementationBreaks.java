package net.upliftinglemma.test.autovalue.breaks;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ImplementationBreaks implements InterfaceBreaks<String> {

    public static Builder builder() {
        return new AutoValue_ImplementationBreaks.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder implements InterfaceBreaks.Builder<String, Builder> {

        public abstract ImplementationBreaks build();

    }

}
