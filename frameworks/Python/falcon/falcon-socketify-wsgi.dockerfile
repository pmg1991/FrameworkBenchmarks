FROM python:3.10-bullseye

RUN apt-get update; apt-get install libpq-dev python3-dev libuv1-dev -y
COPY ./ /falcon
WORKDIR /falcon
RUN pip3 install -U pip; \
    pip3 install cython==0.29.26; \
    pip3 install falcon==3.0.1 --no-binary :all:; \
    pip3 install -r /falcon/requirements-socketify.txt

EXPOSE 8080

CMD python app-socketify-wsgi.py