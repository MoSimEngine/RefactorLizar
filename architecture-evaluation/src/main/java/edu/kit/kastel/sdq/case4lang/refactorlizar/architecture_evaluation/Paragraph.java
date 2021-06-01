package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Paragraph {

    public String chapterNumber();

    public String source() default "";
}
