FROM alpine
RUN apk add nginx
#RUN nginx
CMD ["nginx"]
EXPOSE 80
#COPY c:/users/layuj/17349/despliegue /var/lib/nginx/html
COPY ./despliegue /var/lib/nginx/html
COPY 