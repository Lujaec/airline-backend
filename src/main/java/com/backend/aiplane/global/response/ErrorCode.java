package com.backend.aiplane.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    /**
     *  400 Bad Request
     */


    /**
     *  401 Unauthorized
     */
    UNAUTHORIZED(401,HttpStatus.UNAUTHORIZED, "접근할 수 있는 권한이 없습니다. access token을 확인하세요."),
    INVALID_JWT_ACCESS_TOKEN(401,HttpStatus.UNAUTHORIZED,  "유효하지 않은 ACCESS TOKEN 입니다"),
    EXPIRED_JWT_ACCESS_TOKEN(401,HttpStatus.UNAUTHORIZED, "ACCESS TOKEN이 만료되었습니다. 재발급 받아주세요."),
    INVALID_JWT_REFRESH_TOKEN(401,HttpStatus.UNAUTHORIZED,  "유효하지 않은 REFRESH TOKEN 입니다."),
    EXPIRED_JWT_REFRESH_TOKEN(401,HttpStatus.UNAUTHORIZED, "REFRESH TOKEN이 만료되었습니다. 다시 로그인해주세요"),

    /**
     *  403 Forbidden
     */
    WRONG_USER_PASSWORD(403,HttpStatus.FORBIDDEN, "입력하신 비밀번호가 올바르지 않습니다."),
    USER_NOT_HAVE_ENOUGH_TICKET(403,HttpStatus.FORBIDDEN, "보유한 티켓의 수가 부족합니다. 티켓을 충전해주세요."),
    USER_NOT_TEAMLEADER(403,HttpStatus.FORBIDDEN, "해당 명령을 실행할 수 없습니다. 팀 리더가 아닙니다."),
    USER_NOT_APPLY_STATUS(403,HttpStatus.FORBIDDEN, "팀에 지원 취소를 할 수 없습니다. 유저가 지원자 상태가 아닙니다."),
    USER_ROLE_NOT_CHANGE(403,HttpStatus.FORBIDDEN, "해당 팀원의 역할을 변경할 수 없습니다. 해당 유저가 지원자 상태가 아닙니다."),
    TEAM_PROGRESS_NOT_RECRUITING(403,HttpStatus.FORBIDDEN, "해당 팀이 모집 중 상태가 아닙니다."),


    /**
     *  404 Not Found
     */
    ENTITY_NOT_FOUND(404,HttpStatus.NOT_FOUND, "요청하신 엔티티를 찾을 수 없습니다."),
    USER_NOT_FOUND(404,HttpStatus.NOT_FOUND, "요청하신 유저를 찾을 수 없습니다."),
    NOT_SIGN_IN_KAKAO_ID(404,HttpStatus.NOT_FOUND, "회원가입되지 않은 KAKAO 계정입니다. 회원가입을 진행해 주세요"),

    ENUM_NOT_FOUND(404,HttpStatus.NOT_FOUND, "요청하신 ENUM TYPE을 찾을 수 없습니다."),

    CONTEST_NOT_FOUND(404,HttpStatus.NOT_FOUND, "요청하신 공모전을 찾을 수 없습니다."),
    USER_REVIEW_NOT_FOUND(404,HttpStatus.NOT_FOUND, "요청하신 유저의 리뷰를 찾을 수 없습니다."),

    TEAM_NOT_FOUND(404,HttpStatus.NOT_FOUND,"요청하신 팀을 찾을 수 없습니다."),
    TEAM_USER_NOT_FOUND(404,HttpStatus.NOT_FOUND,"요청하신 팀원을 찾을 수 없습니다."),

    /**
     * 409 Conflict
     */
    DUPLICATE_SAMPLE_TEXT(409, HttpStatus.CONFLICT, "이미 존재하는 TEXT입니다."),
    DUPLICATE_USER_NAME(409, HttpStatus.CONFLICT, "이미 존재하는 유저 이름 입니다."),
    DUPLICATE_KAKAO_ID(409, HttpStatus.CONFLICT, "이미 회원가입 된 카카오 계정 입니다."),
    DUPLICATE_USER_REVIEW_TEAM(409, HttpStatus.CONFLICT, "이미 회원님이 해당 팀에 리뷰를 남겼습니다."),
    ALREADY_USER_USE_TICKET(409, HttpStatus.CONFLICT, "이미 해당 유저에게 티켓을 사용했습니다."),
    ALREADY_USER_REVIEWED_BY_NON_USER(409, HttpStatus.CONFLICT, "이미 해당 유저는 다른 비회원에게 추천사를 작성 받았습니다."),
    ALREADY_USER_OPEN_TEAM(409, HttpStatus.CONFLICT, "이미 해당 공모전에 유저가 오픈한 팀이 있습니다."),
    ALREADY_USER_APPLY_TEAM(409, HttpStatus.CONFLICT, "이미 해당 팀에 지원한 유저입니다."),
    USER_NOT_HAVE_AUTHORITY(409, HttpStatus.CONFLICT, "변경 권한이 없는 유저입니다."),
    ALREADY_USER_APPLY_CONTEST(409, HttpStatus.CONFLICT, "이미 해당 공모전에 지원한 유저입니다."),
    /**
     *  500 INTERNAL SERVER ERROR
     */
    INTERNAL_SERVER_ERROR(500, HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다."),
    FILE_UPLOAD_FAILED(500, HttpStatus.INTERNAL_SERVER_ERROR, "S3 이미지 업로드에 실패");


    private final int statusCode;
    private final   HttpStatus status;
    private final   String message;
}