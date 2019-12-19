package net.upliftinglemma.test.autovalue.works;

import javax.annotation.Nullable;

public interface InterfaceWorks<FOO> {

    @Nullable
    FOO getFoo();


    interface Builder<FOO, BUILDER extends Builder<FOO, BUILDER>> {

        BUILDER setFoo(@Nullable FOO foo);

    }

}
