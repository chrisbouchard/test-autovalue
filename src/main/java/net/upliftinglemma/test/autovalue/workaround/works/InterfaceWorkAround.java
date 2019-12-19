package net.upliftinglemma.test.autovalue.workaround.works;

import javax.annotation.Nullable;

public interface InterfaceWorkAround<FOO> {

    @Nullable
    FOO getFoo();


    interface Builder<FOO, BUILDER extends Builder<FOO, BUILDER>> {

        BUILDER setFoo(@Nullable FOO foo);

    }

}
