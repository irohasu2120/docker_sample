FROM php:7.4-fpm-alpine

RUN apk update && \
    apk add --no-cache tzdata unzip && \
    cp /usr/share/zoneinfo/Asia/Tokyo /etc/localtime && \
    echo "Asia/Tokyo" > /etc/timezone && \
    apk del tzdata
RUN docker-php-ext-install -j$(nproc) pdo_mysql bcmath 

RUN curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer
