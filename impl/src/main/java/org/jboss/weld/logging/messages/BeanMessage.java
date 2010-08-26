/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.logging.messages;

import org.jboss.weld.logging.MessageId;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("org.jboss.weld.messages.bean")
@LocaleData({
   @Locale("en")
})
/**
 * Log messages for Beans.
 * 
 * Message IDs: 000000 - 000099
 *              001500 - 001599
 * 
 */
public enum BeanMessage
{
   @MessageId("000000") FOUND_INJECTABLE_CONSTRUCTORS,
   @MessageId("000001") FOUND_ONE_INJECTABLE_CONSTRUCTOR,
   @MessageId("000002") FOUND_DEFAULT_CONSTRUCTOR,
   @MessageId("000003") FOUND_POST_CONSTRUCT_METHODS,
   @MessageId("000004") FOUND_ONE_POST_CONSTRUCT_METHOD,
   @MessageId("000005") FOUND_PRE_DESTROY_METHODS,
   @MessageId("000006") FOUND_ONE_PRE_DESTROY_METHOD,
   @MessageId("000007") CREATED_SESSION_BEAN_PROXY,
   @MessageId("000008") CALL_PROXIED_METHOD,
   @MessageId("000009") DYNAMIC_LOOKUP_OF_BUILT_IN_NOT_ALLOWED,
   @MessageId("000010") QUALIFIERS_USED,
   @MessageId("000011") USING_DEFAULT_QUALIFIER,
   @MessageId("000012") CREATING_BEAN,
   @MessageId("000013") USING_DEFAULT_NAME,
   @MessageId("000014") USING_NAME,
   @MessageId("000015") USING_SCOPE_FROM_STEREOTYPE,
   @MessageId("000016") USING_SCOPE,
   @MessageId("000017") USING_DEFAULT_SCOPE,
   @MessageId("000018") CIRCULAR_CALL,
   @MessageId("000019") ERROR_DESTROYING,
   @MessageId("000020") DELEGATE_INJECTION_POINT_NOT_FOUND,
   @MessageId("000021") ANNOTATION_NOT_BINDING,
   @MessageId("000022") DUPLICATE_BINDING,
   @MessageId("000023") TYPE_PARAMETER_MUST_BE_CONCRETE,
   @MessageId("000024") VALIDATION_SERVICE_NOT_AVAILABLE,
   @MessageId("000025") INVALID_RESOURCE_PRODUCER_FIELD,
   @MessageId("000026") SECURITY_SERVICES_NOT_AVAILABLE,
   @MessageId("000027") TRANSACTION_SERVICES_NOT_AVAILABLE,
   @MessageId("000028") INTERCEPTION_MODEL_NULL,
   @MessageId("000029") INTERCEPTION_TYPE_NULL,
   @MessageId("000030") METHOD_NULL,
   @MessageId("000031") INTERCEPTION_TYPE_LIFECYCLE,
   @MessageId("000032") INTERCEPTION_TYPE_NOT_LIFECYCLE,
   @MessageId("000033") PROXY_INSTANTIATION_FAILED,
   @MessageId("000034") PROXY_INSTANTIATION_BEAN_ACCESS_FAILED,
   @MessageId("000035") BEAN_ID_CREATION_FAILED,
   @MessageId("000036") UNEXPECTED_UNWRAPPED_CUSTOM_DECORATOR,
   @MessageId("000037") INVALID_REMOVE_METHOD_INVOCATION,
   @MessageId("000038") DELEGATE_NOT_ON_DECORATOR,
   @MessageId("000039") TYPED_CLASS_NOT_IN_HIERARCHY,
   @MessageId("000040") MULTIPLE_SCOPES_FOUND_FROM_STEREOTYPES,
   @MessageId("000041") NAME_NOT_ALLOWED_ON_SPECIALIZATION,
   @MessageId("000042") NON_CONTAINER_DECORATOR,
   @MessageId("000043") BEAN_NOT_EE_RESOURCE_PRODUCER,
   @MessageId("000044") NULL_INSTANCE,
   @MessageId("000045") PROXY_REQUIRED,
   @MessageId("000046") ONLY_ONE_SCOPE_ALLOWED,
   @MessageId("000047") SPECIALIZING_BEAN_MUST_EXTEND_A_BEAN,
   @MessageId("000048") CONFLICTING_INTERCEPTOR_BINDINGS,
   @MessageId("000049") INVOCATION_ERROR,
   @MessageId("000050") PRODUCER_CAST_ERROR,
   @MessageId("000051") RETURN_TYPE_MUST_BE_CONCRETE,
   @MessageId("000052") NULL_NOT_ALLOWED_FROM_PRODUCER,
   @MessageId("000053") NON_SERIALIZABLE_PRODUCT_ERROR,
   @MessageId("000054") NON_SERIALIZABLE_FIELD_INJECTION_ERROR,
   @MessageId("000055") NON_SERIALIZABLE_INITIALIZER_PARAM_INJECTION_ERROR,
   @MessageId("000056") NON_SERIALIZABLE_PRODUCER_PARAM_INJECTION_ERROR,
   @MessageId("000057") NON_SERIALIZABLE_CONSTRUCTOR_PARAM_INJECTION_ERROR,
   @MessageId("000058") DELEGATE_ON_NON_INITIALIZER_METHOD,
   @MessageId("000059") NO_DELEGATE_FOR_DECORATOR,
   @MessageId("000060") TOO_MANY_DELEGATES_FOR_DECORATOR,
   @MessageId("000061") DELEGATE_MUST_SUPPORT_EVERY_DECORATED_TYPE,
   @MessageId("000062") DECORATED_TYPE_PARAMETERIZED_DELEGATE_NOT,
   @MessageId("000063") DELEGATE_TYPE_PARAMETER_MISMATCH,
   @MessageId("000064") UNABLE_TO_PROCESS,
   @MessageId("000065") DISPOSE_NOT_FIRST_PARAM,
   @MessageId("000066") MULTIPLE_DISPOSE_PARAMS,
   @MessageId("000067") INCONSISTENT_ANNOTATIONS_ON_METHOD,
   @MessageId("000068") METHOD_NOT_BUSINESS_METHOD,
   @MessageId("000069") MISSING_BINDING_ON_INTERCEPTOR,
   @MessageId("000070") SIMPLE_BEAN_AS_NON_STATIC_INNER_CLASS_NOT_ALLOWED,
   @MessageId("000071") BEAN_MUST_BE_DEPENDENT,
   @MessageId("000072") PASSIVATING_BEAN_NEEDS_SERIALIZABLE_IMPL,
   @MessageId("000073") FINAL_BEAN_CLASS_WITH_DECORATORS_NOT_ALLOWED,
   @MessageId("000074") FINAL_DECORATED_BEAN_METHOD_NOT_ALLOWED,
   @MessageId("000075") PUBLIC_FIELD_ON_NORMAL_SCOPED_BEAN_NOT_ALLOWED,
   @MessageId("000076") PARAMETER_ANNOTATION_NOT_ALLOWED_ON_CONSTRUCTOR,
   @MessageId("000077") MULTIPLE_DISPOSAL_METHODS,
   @MessageId("000078") PRODUCER_METHOD_NOT_SPECIALIZING,
   @MessageId("000079") EJB_NOT_FOUND,
   @MessageId("000080") EJB_CANNOT_BE_INTERCEPTOR,
   @MessageId("000081") EJB_CANNOT_BE_DECORATOR,
   @MessageId("000082") SCOPE_NOT_ALLOWED_ON_STATELESS_SESSION_BEAN,
   @MessageId("000083") SCOPE_NOT_ALLOWED_ON_SINGLETON_BEAN,
   @MessageId("000084") SPECIALIZING_ENTERPRISE_BEAN_MUST_EXTEND_AN_ENTERPRISE_BEAN,
   @MessageId("000085") CANNOT_DESTROY_NULL_BEAN,
   @MessageId("000086") CANNOT_DESTROY_ENTERPRISE_BEAN_NOT_CREATED,
   @MessageId("000087") MESSAGE_DRIVEN_BEANS_CANNOT_BE_MANAGED,
   @MessageId("000088") OBSERVER_METHOD_MUST_BE_STATIC_OR_BUSINESS,
   @MessageId("000089") TOO_MANY_EJBS_FOR_CLASS,
   @MessageId("000090") ABSTRACT_METHOD_MUST_MATCH_DECORATED_TYPE,
   @MessageId("000091") IP_NOT_CONSTRUCTOR_OR_METHOD,
   @MessageId("000092") PARAM_NOT_IN_PARAM_LIST,
   @MessageId("000093") CANNOT_READ_OBJECT,
   @MessageId("000094") INJECTED_FIELD_CANNOT_BE_PRODUCER,
   @MessageId("000095") GENERIC_SESSION_BEAN_MUST_BE_DEPENDENT,
   @MessageId("000096") PRODUCER_FIELD_ON_SESSION_BEAN_MUST_BE_STATIC,
   @MessageId("000097") PRODUCER_METHOD_WITH_TYPE_VARIABLE_RETURN_TYPE_MUST_BE_DEPENDENT,
   @MessageId("000098") PRODUCER_METHOD_WITH_WILDCARD_RETURN_TYPE_MUST_BE_DEPENDENT,
   @MessageId("000099") CANNOT_LOAD_CLASS,
   @MessageId("001500") PROXY_DESERIALIZATION_FAILURE,
   @MessageId("001501") BEAN_INSTANCE_NOT_SET_ON_PROXY,
   @MessageId("001502") NON_DEPENDENT_RESOURCE_PRODUCER_FIELD,
   @MessageId("001503") FINAL_BEAN_CLASS_WITH_INTERCEPTORS_NOT_ALLOWED,
   @MessageId("001504") FINAL_INTERCEPTED_BEAN_METHOD_NOT_ALLOWED,
   @MessageId("001505") FAILED_TO_SET_THREAD_LOCAL_ON_PROXY;
   
}
