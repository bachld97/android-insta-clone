package com.example.instagramclone.domain

interface UseCase<Request, Response> {
    interface ResponseCallback<Response> {
        fun onSuccess(response: Response)
        fun onFailure(error: Error?)
    }

    fun execute(request: Request, responseCallback: ResponseCallback<Response>)
}
