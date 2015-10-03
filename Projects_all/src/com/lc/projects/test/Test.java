package com.lc.projects.test;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

public class Test {
	public static void main(String[] args) throws ClientProtocolException,
			IOException, KeyManagementException, NoSuchAlgorithmException,
			KeyStoreException {

		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null,
				new TrustStrategy() {
					@Override
					public boolean isTrusted(
							java.security.cert.X509Certificate[] arg0,
							String arg1)
							throws java.security.cert.CertificateException {
						return true;
					}

				}).build();

		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslContext, new HostnameVerifier() {

					@Override
					public boolean verify(String hostname, SSLSession session) {
						// TODO Auto-generated method stub
						return true;
					}
				});

		HttpClient client = HttpClients.custom().setSSLSocketFactory(sslsf)
				.build();
		// String url =
		// "https://192.168.0.100:8088/Project_web_all/LoginServlet";
		String url = "https://www.baidu.com";
		// CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		HttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		System.out.println(entity);
		System.out.println(entity.getContent());
		System.out.println(EntityUtils.toString(entity));

	}
}
