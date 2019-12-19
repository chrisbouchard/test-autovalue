package net.upliftinglemma.test.autovalue.workaround.works;

import javax.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ImplementationWorkAround implements InterfaceWorkAround<String> {

    public static Builder builder() {
        return new AutoValue_ImplementationWorkAround.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder implements InterfaceWorkAround.Builder<String, Builder> {

        // Repeating the method here specialized makes it work.
        @Override
        public abstract Builder setFoo(@Nullable String foo);

        public abstract ImplementationWorkAround build();

    }

}
