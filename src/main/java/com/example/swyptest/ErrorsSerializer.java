//package com.example.swyptest;
//
//
//import com.example.swyptest.ErrorCode;
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.SerializerProvider;
//import org.springframework.boot.jackson.JsonComponent;
//import org.springframework.validation.Errors;
//
//
//import java.io.IOException;
//
//@JsonComponent
//public class ErrorsSerializer extends JsonSerializer<Errors> {
//    @Override
//    public void serialize(Errors errors, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//        // 객체를 시작
//        gen.writeStartObject();
//
//        // ErrorCode 관리 Enum
//        ErrorCode errorCode = ErrorCode.INVALID_INPUT_VALUE;
//
//        // 에러를 배열로 작성
//        gen.writeBooleanField("success", false);
//        gen.writeStringField("code", errorCode.getCode());
//        gen.writeStringField("message", "입력 값에 대한 검증을 실패했습니다.");
//        gen.writeArrayFieldStart("data");
//
//        // 필드 관련 에러 직렬화
//        errors.getFieldErrors().forEach(e -> {
//            try {
//                gen.writeStartObject(); // 객체 시작
//                gen.writeStringField("field", e.getField());
//                //gen.writeStringField("objectName", e.getObjectName());
//                gen.writeStringField("code", e.getCode());
//                gen.writeStringField("defaultMessage", e.getDefaultMessage());
//                Object rejectedValue = e.getRejectedValue();
//                if (rejectedValue != null) {
//                    gen.writeStringField("rejectedValue", rejectedValue.toString());
//                }
//                gen.writeEndObject(); // 객체 종료
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        // 글로벌 에러 직렬화
//        errors.getGlobalErrors().forEach(e -> {
//            try {
//                gen.writeStartObject(); // 객체 시작
//                gen.writeStringField("objectName", e.getObjectName());
//                gen.writeStringField("code", e.getCode());
//                gen.writeStringField("defaultMessage", e.getDefaultMessage());
//                gen.writeEndObject(); // 객체 종료
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        // 배열 종료
//        gen.writeEndArray();
//
//        // 객체 종료
//        gen.writeEndObject();
//    }
//}
//
