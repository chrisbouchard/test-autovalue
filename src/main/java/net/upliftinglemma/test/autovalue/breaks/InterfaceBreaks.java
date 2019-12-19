package net.upliftinglemma.test.autovalue.breaks;

import javax.annotation.Nullable;

import java.util.Optional;

public interface InterfaceBreaks<FOO> {

    Optional<FOO> getFoo();


    interface Builder<FOO, BUILDER extends Builder<FOO, BUILDER>> {

        BUILDER setFoo(@Nullable FOO foo);

    }

}
