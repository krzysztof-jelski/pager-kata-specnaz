package it.craftcomplete.pager;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.specnaz.Specnaz;
import org.specnaz.junit.SpecnazJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpecnazJUnitRunner.class)
public class PagerTest implements Specnaz {
    {
        describes("Pager", it -> {
            it.describes("without offset", () -> {

                Pager pager = new Pager().documents(2).perPage(1);

                it.should("start at first page", () -> assertThat(pager.currentPage()).isEqualTo(1));
                it.should("know the number of pages", () -> assertThat(pager.pages()).isEqualTo(2));
                it.should("not show previous page link", () -> {
//                    assertThat(pager.links()).startsWith(new PageLink())
                });
            });

            it.describes("with offset", () -> {
                Pager pager = new Pager().documents(2).perPage(1).startAt(2);

                it.should("set page from offset as current", () -> {
                    assertThat(pager.currentPage()).isEqualTo(2);
                });
            });

        });
    }

}
