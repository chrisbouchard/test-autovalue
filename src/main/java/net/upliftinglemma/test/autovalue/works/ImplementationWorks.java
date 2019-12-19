package net.upliftinglemma.test.autovalue.works;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ImplementationWorks implements InterfaceWorks<String> {

    public static Builder builder() {
        return new AutoValue_ImplementationWorks.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder implements InterfaceWorks.Builder<String, Builder> {

        public abstract ImplementationWorks build();

    }

}
