package com.bullorbear.dynamodb.extensions.mapper.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/***
 * Used to mark hashkey parameters to the DynamoDB table
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface HashKey {

}
