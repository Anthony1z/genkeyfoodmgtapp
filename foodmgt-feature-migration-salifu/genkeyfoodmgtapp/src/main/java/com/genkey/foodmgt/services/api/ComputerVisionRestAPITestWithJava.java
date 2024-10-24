//package com.genkey.foodmgt.services.api;
//
//    // // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//
//    public class ComputerVisionRestAPITestWithJava
//    {
//        public static void main(String[] args)
//        {
//            HttpClient httpclient = HttpClients.createDefault();
//
//            try
//            {
//                URIBuilder builder = new URIBuilder("https://*.cognitiveservices.azure.com/vision/v3.2/read/analyze");
//
//                builder.setParameter("language", "{string}");
//                builder.setParameter("pages", "{string}");
//                builder.setParameter("readingOrder", "{string}");
//                builder.setParameter("model-version", "{string}");
//
//                URI uri = builder.build();
//                HttpPost request = new HttpPost(uri);
//                request.setHeader("Content-Type", "application/json");
//                request.setHeader("Ocp-Apim-Subscription-Key", "{subscription key}");
//
//
//                // Request body
//                StringEntity reqEntity = new StringEntity("{body}");
//                request.setEntity(reqEntity);
//
//                HttpResponse response = httpclient.execute(request);
//                HttpEntity entity = response.getEntity();
//
//                if (entity != null)
//                {
//                    System.out.println(EntityUtils.toString(entity));
//                }
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
